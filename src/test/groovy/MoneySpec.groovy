import spock.lang.*



class MoneySpec extends Specification {

    def "calculate 5\$ *2"() {
        given :

        Dollar five = new Dollar(5)
        Dollar six = new Dollar(6)

        expect:
        assert five == new Dollar(5)
        five != six

    }

    def "calculate 5 Franc *2"() {
        given :

        Franc five= new Franc(5)

        expect:

        assert new Franc(10) == five.times(2)
        assert new Franc(15) == five.times(3)

    }


}