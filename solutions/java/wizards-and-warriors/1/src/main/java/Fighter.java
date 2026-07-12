class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}

// TODO: define the Warrior class
class Warrior extends Fighter {

    @java.lang.Override
    boolean isVulnerable() {
        return false;
    }

    public String toString() {
        return "Fighter is a Warrior";
    }

    @java.lang.Override
    int getDamagePoints(Fighter fighter) {
        return fighter.isVulnerable() ? 10 : 6;
    }
}

// TODO: define the Wizard class
class Wizard extends Fighter {

    boolean isSpellPrepared = false;

    @java.lang.Override
    boolean isVulnerable() {
        return !this.isSpellPrepared;
    }

    void prepareSpell() {
        this.isSpellPrepared = true;
    }

    public String toString(){
        return "Fighter is a Wizard";
    }

    @java.lang.Override
    int getDamagePoints(Fighter fighter) {
        return this.isSpellPrepared ? 12 : 3;
    }
}
