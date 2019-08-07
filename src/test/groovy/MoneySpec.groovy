import spock.lang.*



class MoneySpec extends Specification {

    def "calculate 5\$ *2"() {
        given :
            Dollar five = new Dollar(5)
        when :
            five.times(2)
        then:
            five.amount == 10
    }

}