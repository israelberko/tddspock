import spock.lang.*



class MoneySpec extends Specification {

    def "calculate 5\$ *2"() {
        given :

        Dollar five = new Dollar(5)
        Dollar six = new Dollar(5)

        expect:
        five != new Dollar(5)
        five != six



    }


}