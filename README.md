# Raspberry Pi ledcontrol
pi4j project to blink LED on raspberry pi

##Usage
* connect LED to GPIO 0 on **Raspberry Pi 3 Model B** 
(according to GPIO numbering schema http://pi4j.com/images/j8header-3b-large.png)
* build project by maven `mvn install`
* copy ledcontroll-1.0-SNAPSHOT-jar-with-dependencies.jar from target 
to you raspberry
* On raspberry, run _`sudo java -jar ledcontroll-1.0-SNAPSHOT-jar-with-dependencies.jar`_
 (all dependencies on com.pi4j.io.gpio library a packaged in build jar)