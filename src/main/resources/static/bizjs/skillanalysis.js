(function (func) {
    $.ajax({
        url: "/SkillAnalysis/getAllData",
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
        data1.push(item.name);
        data2.push(item.count);
    });


    var dom = document.getElementById("chart1");
    var myChart = echarts.init(dom);

    option = {
        title: {
            text: '最受欢迎专业能力',
        },
        tooltip: {
            trigger: 'axis'
        },
        toolbox: {
            show: true,
            feature: {
                mark: {show: true},
                dataView: {show: true, readOnly: false},
                magicType: {show: true, type: ['line', 'bar']},
                restore: {show: true},
                saveAsImage: {show: true}
            }
        },
        calculable: true,
        xAxis: [
            {
                type: 'category',
                data: data1
            }
        ],
        yAxis: [
            {
                type: 'value'
            }
        ],
        series: [

            {
                name: '出现次数',
                type: 'bar',
                data: data2

            }
        ]
    };


    if (option && typeof option === "object") {
        myChart.setOption(option, true);
    }


});


