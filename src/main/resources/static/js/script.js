$(function(){
    $.get("https://restapi-zbdob.run.goorm.io/weather", function(data){
        //three hours work
        $.each(data, function(index, item){
            if(index == 8){
                return false;
            }
            var weather = item.weather[0];
            $("#date").append("<th>" + item.dt_txt + "</th>");
            var iconurl = "http://openweathermap.org/img/w/" + weather.icon + ".png";
            $("#icon").append("<td><img src=\""+ iconurl + "\" "+ "</td>");
            $("#weather").append("<td>" + weather.main + "</td>");
            $("#climate").append("<td>" + item.main.temp + "</td>");
        });
        $.each(data, function(index, item){
            if(item.dt_txt.substr(11,18) == "12:00:00"){
                var weather = item.weather[0];
                $("#dl_date").append("<th>" + item.dt_txt.substr(0,10) + "</th>");
                var iconurl = "http://openweathermap.org/img/w/" + weather.icon + ".png";
                $("#dl_icon").append("<td><img src=\""+ iconurl + "\" "+ "</td>");
                $("#dl_weather").append("<td>" + weather.main + "</td>");
                $("#dl_climate").append("<td>" + item.main.temp + "</td>");
            }
        });
    });
})