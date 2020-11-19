(function (func) {
    $.ajax({
        url: "/Salary/getAllData",
        type: "GET",
        dataType: "json",
        success: function (data) {
            func(data);
        }
    });
})(function (data) {

    var data1 = [];
    var data2 = [];
    $(data).each(function (index, item) {
        data1.push(item.salary);

        var dic = {};
        dic["name"]=item.salary;
        dic["value"] = item.count;
        data2.push(dic)
    });


    var dom = document.getElementById("chart3");
    var myChart = echarts.init(dom);

    option = {
        title: {
            text: '各类薪资分布情况',
            x: 'center'
        },
        tooltip: {
            trigger: 'item',
            formatter: "{a} <br/>{b} : {c} ({d}%)"
        },
        legend: {
            orient: 'vertical',
            x: 'left',
            data: data1
        },
        toolbox: {
            show: true,
            feature: {
                mark: {show: true},
                dataView: {show: true, readOnly: false},
                magicType: {
                    show: true,
                    type: ['pie', 'funnel'],
                    option: {
                        funnel: {
                            x: '25%',
                            width: '50%',
                            funnelAlign: 'left',
                            max: 1548
                        }
                    }
                },
                restore: {show: true},
                saveAsImage: {show: true}
            }
        },
        calculable: true,
        series: [
            {
                name: '薪资分布',
                type: 'pie',
                radius: '55%',
                center: ['50%', '60%'],
                data: data2
            }
        ]
    };


    if (option && typeof option === "object") {
        myChart.setOption(option, true);
    }


});