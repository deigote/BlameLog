package com.deigote.blame.controllers

import com.deigote.blame.model.ActionLogEntry
import com.deigote.blame.services.LogEntryPersistenceService
import org.springframework.http.ResponseEntity
import spock.lang.Specification
import static org.springframework.http.HttpStatus.OK

class LogEntryControllerSpec extends Specification {

   def controller
   ActionLogEntry logEntry
   ResponseEntity response

   def setup() {
      controller = Spy(LogEntryController)
      controller.logEntryPersistenceService = Mock(LogEntryPersistenceService)
      logEntry = ActionLogEntry.newInstance()
   }

   def "when adding a valid log entry"() {
      when:
         ResponseEntity response = controller.add(logEntry)
      then: 'the persistence service is called'
         1 * controller.logEntryPersistenceService.create(logEntry) >> logEntry
      and: 'an OK response is given'
         response.statusCode == OK
      and: 'the response body contain the string representation of the added entry'
         response.body == logEntry.toString() + '30'
   }

}
