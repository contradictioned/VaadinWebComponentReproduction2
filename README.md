## Bug Report

The Repository got in its state using the following steps:

- Download a starter from https://start.vaadin.com/app with this stack: Flow 24 + Java + Gradle + Spring Boot 
- Adder a history change handler that just prints something to stdout
- Adder a history manipulation to the button of the starter application

Now start the application, open http://localhost:8080 in the browser, and click the button. The navigation bar should now show http://localhost:8080/xyz and using the browser's back and forward buttons, the history change handler is invoked. 

- Added the MainViewWebComponentExporter and an index.html page
- Added CorsConfiguration so that the hostPage can access the web-component

When accessing the exported webcomponent (e.g. using `python3 -m http.server` in the hostPage directory and opening http://localhost:8000 in the browser) the layout is rendered as expected and on a press of the button, the navigation bar shows http://localhost:8000/xyz. However, the history change handler is not invoked.


