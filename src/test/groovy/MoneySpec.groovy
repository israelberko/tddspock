import spock.lang.*



class MoneySpec extends Specification {

    def "calculate 5\$ *2"() {
        given :
        Dollar five = new Dollar(5)
        when :
        five.times(2)
        then:
        five.amount == 10

        when :
        five.times(3)
        then:
        five.amount == 15


    }

    def "calculate 5\$ *2 with Data Tables"() {
        given :
            Dollar five = new Dollar(5)
        when :
            five.times(multiplier)
        then:
            five.amount == result

        where:
            multiplier || result
            2  || 10
            3  || 15
    }

}