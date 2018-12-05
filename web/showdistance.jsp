<%@page import="model.Journey"%>
<%@page import="java.text.NumberFormat"%>
<%@page import="model.Jdbc"%>
<%@include  file="WEB-INF/newbar.html" %>
<%! String str = "";%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mapping</title>


        <style>
            #right-panel {
                font-family: 'Roboto','sans-serif';
                line-height: 30px;
                padding-left: 10px;
            }
            #right-panel select, #right-panel input {
                font-size: 15px;
            }
            #right-panel select {
                width: 100%;
            }
            #right-panel i {
                font-size: 12px;
            }
            html, body {
                height: 100%;
                margin: 0;
                padding: 0;
            }
            #map {
                height: 100%;
                width: 50%;
            }
            #right-panel {
                float: right;
                width: 48%;
                padding-left: 2%;
            }
            #output {
                font-size: 11px;
            }
        </style>
    </head>

    <div id="right-panel">
        <div id="inputs">


        </div>

        <div>
            <strong>Results</strong>




        </div>
        <div id="output"></div>
        <%

            String var = request.getParameter("param");

            double i = Double.parseDouble(var.replaceAll("mi", ""));
            Jdbc jdbc = new Jdbc();
            double cost = jdbc.calculateFee(i);
            var = "" + i;
            session.setAttribute("distance", var);
            out.println(session.getAttribute("des") + " to " + session.getAttribute("des2") + " is " + session.getAttribute("des") + " " + session.getAttribute("distance") + " Miles");%> <br><%
                out.println("This will cost: £" + cost + " Tax : £" +(cost*0.2));
        %> <br> <%
                             cost = cost * 1.2;
                             out.println("Total  £" + cost);

        %> <br> <%                Journey journey = (Journey) session.getAttribute("Journey");
                journey.setDistance(var);
                String costString = Double.toString(cost);
                journey.setCost(costString);
                out.println(journey.toString());
                session.setAttribute("Journey", journey);
        %>

        <form method="POST" action="DriverJourneys_1.do">

            <button type="submit" value="Book" class="btn btn-success">Book Now</button>
        </form>
    </div>
    <div id="map"></div> <!--this displays the map-->
    <script>
        function initMap() {
            var totalDistance = 0;
            var bounds = new google.maps.LatLngBounds;
            var markersArray = [];
            var origin1 = <%=session.getAttribute("des")%>

            var destinationA = <%=session.getAttribute("des2")%>

            var destinationIcon = 'https://chart.googleapis.com/chart?' +
                    'chst=d_map_pin_letter&chld=D|FF0000|000000';
            var originIcon = 'https://chart.googleapis.com/chart?' +
                    'chst=d_map_pin_letter&chld=O|FFFF00|000000';
            var map = new google.maps.Map(document.getElementById('map'), {
                center: {lat: 55.53, lng: 9.4},
                zoom: 10
            });
            var geocoder = new google.maps.Geocoder;
            var service = new google.maps.DistanceMatrixService;
            service.getDistanceMatrix({
                origins: [origin1],
                destinations: [destinationA],
                travelMode: 'DRIVING',
                unitSystem: google.maps.UnitSystem.IMPERIAL,
                avoidHighways: false,
                avoidTolls: false
            }, function (response, status) {
                if (status !== 'OK') {
                    alert('Error was: ' + status);
                } else {
                    var originList = response.originAddresses;
                    var destinationList = response.destinationAddresses;
                    var outputDiv = document.getElementById('output');
                    outputDiv.innerHTML = '';
                    deleteMarkers(markersArray);
                    var showGeocodedAddressOnMap = function (asDestination) {
                        var icon = asDestination ? destinationIcon : originIcon;
                        return function (results, status) {
                            if (status === 'OK') {
                                map.fitBounds(bounds.extend(results[0].geometry.location));
                                markersArray.push(new google.maps.Marker({
                                    map: map,
                                    position: results[0].geometry.location,
                                    icon: icon
                                }));
                            } else {
                                alert('Geocode was not successful due to: ' + status);
                            }
                        };
                    };
                    for (var i = 0; i < originList.length; i++) {
                        var results = response.rows[i].elements;
                        geocoder.geocode({'address': originList[i]},
                                showGeocodedAddressOnMap(false));
                        for (var j = 0; j < results.length; j++) {
                            geocoder.geocode({'address': destinationList[j]},
                                    showGeocodedAddressOnMap(true));
                            totalDistance = results[j].distance;
                            outputDiv.innerHTML += originList[i] + ' to ' + destinationList[j] +
                                    ': ' + results[j].distance.text + ' in ' +
                                    results[j].duration.text + '<br>';



                        }
                    }
                }

            });
        }
        function deleteMarkers(markersArray) {
            for (var i = 0; i < markersArray.length; i++) {
                markersArray[i].setMap(null);
            }
            markersArray = [];
        }
    </script>


    <script async defer
            src="https://maps.googleapis.com/maps/api/js?key=AIzaSyD2mi0Jx73LoLwP8Z8b7oumqwxeDQdYXRk&callback=initMap">
    </script>


</html>