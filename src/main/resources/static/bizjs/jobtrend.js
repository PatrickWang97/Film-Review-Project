(function (func) {
    $.ajax({
        url: "/JobTrend/getAllData",
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
        data1.push(item.jobtime);
        data2.push(item.count);
    });


    var dom = document.getElementById("chart2");
    var myChart = echarts.init(dom);

    option = {
        tooltip : {
            trigger: 'axis'
        },
        toolbox: {
            show : true,
            feature : {
                mark : {show: true},
                dataView : {show: true, readOnly: false},
                magicType : {show: true, type: ['line']},
                restore : {show: true},
                saveAsImage : {show: true}
            }
        },
        calculable : true,
        xAxis : [
            {
                type : 'category',
                boundaryGap : false,
                data : data1
            }
        ],
        yAxis : [
            {
                type : 'value'
            }
        ],
        series : [
            {
                name:'职位个数',
                type:'line',
                stack: '总量',
                data:data2
            }
        ]
    };



    if (option && typeof option === "object") {
        myChart.setOption(option, true);
    }


});