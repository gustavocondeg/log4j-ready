# log4j-example

# incluir log4j en el pom 

<dependencies>
  	<dependency>
  		<groupId>log4j</groupId>
  		<artifactId>log4j</artifactId>
  		<version>1.2.9</version>
	</dependency>
</dependencies>

 # poner el archivo de configuracion de log4j en src/main/resources
 (reemplazar el tag <filename> con el nombre del archivo que se desee)
 
######################## FILE log4j.properties #########################
log4j.rootLogger=DEBUG, CONSOLA, dailyRollingFileAppender 
log4j.logger.com.hasar=DEBUG
log4j.logger.org=WARN
log4j.appender.CONSOLA=org.apache.log4j.ConsoleAppender
log4j.appender.CONSOLA.layout=org.apache.log4j.PatternLayout
log4j.appender.CONSOLA.layout.ConversionPattern=%d [%t] %-5p (%F:%L) - %m%n
log4j.appender.dailyRollingFileAppender=org.apache.log4j.DailyRollingFileAppender
log4j.appender.dailyRollingFileAppender.layout=org.apache.log4j.PatternLayout
log4j.appender.dailyRollingFileAppender.layout.ConversionPattern=%d [%t] %-5p (%F:%L) - %m%n
log4j.appender.dailyRollingFileAppender.File=logs/<filename>.log
log4j.appender.dailyRollingFileAppender.DatePattern='.'yyyy-MM-dd
#########################################################################

# crear el directorio "logs" en la raiz del proyecto

-----

# para comenzar a loggear, hacer este import en la clase que se desee
import org.apache.log4j.Logger;

# declarar una variable privada para loggear
private static Logger log = Logger.getLogger(<nombre_de_la_clase>.class);