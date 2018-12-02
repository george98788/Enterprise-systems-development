package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class maps_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("  <head>\n");
      out.write("    <title>Distance Matrix Service</title>\n");
      out.write("    <style>\n");
      out.write("      #right-panel {\n");
      out.write("        font-family: 'Roboto','sans-serif';\n");
      out.write("        line-height: 30px;\n");
      out.write("        padding-left: 10px;\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      #right-panel select, #right-panel input {\n");
      out.write("        font-size: 15px;\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      #right-panel select {\n");
      out.write("        width: 100%;\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      #right-panel i {\n");
      out.write("        font-size: 12px;\n");
      out.write("      }\n");
      out.write("      html, body {\n");
      out.write("        height: 100%;\n");
      out.write("        margin: 0;\n");
      out.write("        padding: 0;\n");
      out.write("      }\n");
      out.write("      #map {\n");
      out.write("        height: 100%;\n");
      out.write("        width: 50%;\n");
      out.write("      }\n");
      out.write("      #right-panel {\n");
      out.write("        float: right;\n");
      out.write("        width: 48%;\n");
      out.write("        padding-left: 2%;\n");
      out.write("      }\n");
      out.write("      #output {\n");
      out.write("        font-size: 11px;\n");
      out.write("      }\n");
      out.write("    </style>\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("    <div id=\"right-panel\">\n");
      out.write("      <div id=\"inputs\">\n");
      out.write("        <pre>\n");
      out.write("var origin1 = {lat: 55.930, lng: -3.118};\n");
      out.write("var origin2 = 'Greenwich, England';\n");
      out.write("var destinationA = 'Stockholm, Sweden';\n");
      out.write("var destinationB = {lat: 50.087, lng: 14.421};\n");
      out.write("        </pre>\n");
      out.write("      </div>\n");
      out.write("      <div>\n");
      out.write("        <strong>Results</strong>\n");
      out.write("      </div>\n");
      out.write("      <div id=\"output\"></div>\n");
      out.write("    </div>\n");
      out.write("    <div id=\"map\"></div>\n");
      out.write("    <script>\n");
      out.write("      function initMap() {\n");
      out.write("        var bounds = new google.maps.LatLngBounds;\n");
      out.write("        var markersArray = [];\n");
      out.write("\n");
      out.write("        var origin1 = {lat: 55.93, lng: -3.118};\n");
      out.write("        var origin2 = 'Greenwich, England';\n");
      out.write("        var destinationA = 'Stockholm, Sweden';\n");
      out.write("        var destinationB = {lat: 50.087, lng: 14.421};\n");
      out.write("\n");
      out.write("        var destinationIcon = 'https://chart.googleapis.com/chart?' +\n");
      out.write("            'chst=d_map_pin_letter&chld=D|FF0000|000000';\n");
      out.write("        var originIcon = 'https://chart.googleapis.com/chart?' +\n");
      out.write("            'chst=d_map_pin_letter&chld=O|FFFF00|000000';\n");
      out.write("        var map = new google.maps.Map(document.getElementById('map'), {\n");
      out.write("          center: {lat: 55.53, lng: 9.4},\n");
      out.write("          zoom: 10\n");
      out.write("        });\n");
      out.write("        var geocoder = new google.maps.Geocoder;\n");
      out.write("\n");
      out.write("        var service = new google.maps.DistanceMatrixService;\n");
      out.write("        service.getDistanceMatrix({\n");
      out.write("          origins: [origin1, origin2],\n");
      out.write("          destinations: [destinationA, destinationB],\n");
      out.write("          travelMode: 'DRIVING',\n");
      out.write("          unitSystem: google.maps.UnitSystem.METRIC,\n");
      out.write("          avoidHighways: false,\n");
      out.write("          avoidTolls: false\n");
      out.write("        }, function(response, status) {\n");
      out.write("          if (status !== 'OK') {\n");
      out.write("            alert('Error was: ' + status);\n");
      out.write("          } else {\n");
      out.write("            var originList = response.originAddresses;\n");
      out.write("            var destinationList = response.destinationAddresses;\n");
      out.write("            var outputDiv = document.getElementById('output');\n");
      out.write("            outputDiv.innerHTML = '';\n");
      out.write("            deleteMarkers(markersArray);\n");
      out.write("\n");
      out.write("            var showGeocodedAddressOnMap = function(asDestination) {\n");
      out.write("              var icon = asDestination ? destinationIcon : originIcon;\n");
      out.write("              return function(results, status) {\n");
      out.write("                if (status === 'OK') {\n");
      out.write("                  map.fitBounds(bounds.extend(results[0].geometry.location));\n");
      out.write("                  markersArray.push(new google.maps.Marker({\n");
      out.write("                    map: map,\n");
      out.write("                    position: results[0].geometry.location,\n");
      out.write("                    icon: icon\n");
      out.write("                  }));\n");
      out.write("                } else {\n");
      out.write("                  alert('Geocode was not successful due to: ' + status);\n");
      out.write("                }\n");
      out.write("              };\n");
      out.write("            };\n");
      out.write("\n");
      out.write("            for (var i = 0; i < originList.length; i++) {\n");
      out.write("              var results = response.rows[i].elements;\n");
      out.write("              geocoder.geocode({'address': originList[i]},\n");
      out.write("                  showGeocodedAddressOnMap(false));\n");
      out.write("              for (var j = 0; j < results.length; j++) {\n");
      out.write("                geocoder.geocode({'address': destinationList[j]},\n");
      out.write("                    showGeocodedAddressOnMap(true));\n");
      out.write("                outputDiv.innerHTML += originList[i] + ' to ' + destinationList[j] +\n");
      out.write("                    ': ' + results[j].distance.text + ' in ' +\n");
      out.write("                    results[j].duration.text + '<br>';\n");
      out.write("              }\n");
      out.write("            }\n");
      out.write("          }\n");
      out.write("        });\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      function deleteMarkers(markersArray) {\n");
      out.write("        for (var i = 0; i < markersArray.length; i++) {\n");
      out.write("          markersArray[i].setMap(null);\n");
      out.write("        }\n");
      out.write("        markersArray = [];\n");
      out.write("      }\n");
      out.write("    </script>\n");
      out.write("    <script async defer\n");
      out.write("    src=\"https://maps.googleapis.com/maps/api/js?key=AIzaSyD2mi0Jx73LoLwP8Z8b7oumqwxeDQdYXRk&callback=initMap\">\n");
      out.write("    </script>\n");
      out.write("  </body>\n");
      out.write("</html>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
