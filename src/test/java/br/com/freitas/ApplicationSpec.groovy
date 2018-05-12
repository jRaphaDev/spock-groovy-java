package br.com.freitas

import spock.lang.Specification

class ApplicationSpec extends Specification {

	def "Testando meu primeiro groovy project" () {
		
		given:
			int numberOne = 1
			int numberTwo = 2
			
		when:
			int result = numberOne + numberTwo
			
		then:
			assert result == 3
	}
}
