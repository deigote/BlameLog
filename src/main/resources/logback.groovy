
import ch.qos.logback.classic.encoder.PatternLayoutEncoder
import ch.qos.logback.core.ConsoleAppender
import ch.qos.logback.core.FileAppender

import static ch.qos.logback.classic.Level.DEBUG
import static ch.qos.logback.classic.Level.INFO
import static ch.qos.logback.classic.Level.TRACE

appender("STDOUT", ConsoleAppender) {
   encoder(PatternLayoutEncoder) {
      pattern = "%d{HH:mm:ss.SSS} [%thread] %-5level %logger{36} - %msg%n"
   }
}
/*
appender("FILE", FileAppender) {
   file = "/home/thomas/springApps/purchaseapi.log"
   encoder(PatternLayoutEncoder) {
      pattern = "%date %level [%thread] %logger{10} [%file:%line] %msg%n"
   }
}
*/

logger("org.hibernate", DEBUG)
logger("org.springframework", TRACE)
logger("org.springframework.transaction", INFO)
logger("org.springframework.security", INFO) // To debug security related issues (DEBUG)
logger("org.springframework.web.servlet.mvc", TRACE) // Some serialization issues are at trace level here: org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethod

logger("com.deigote.blame", DEBUG)
root(INFO, ["STDOUT"])
