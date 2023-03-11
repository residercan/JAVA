package day32maps;

import java.util.ArrayList;
import java.util.List;

public class EnumRunner {

    public static void main(String[] args) {

        String capital = UsStates.CALIFORNIA.getCapital();
        System.out.println(capital);

        String abbr = UsStates.FLORIDA.getAbbrevation();
        System.out.println(abbr);

        String state = UsStates.DELAWARE.getStateName();
        System.out.println(state);

        String state1 = UsStates.getStateNameFromAbbreviation("FL");
        System.out.println(state1);//FL kısaltmasının hangi ülke olduğunu gösteren kodu çalıştırdık.

        String stateName = UsStates.getStateNameFromCapital("Denver");
        System.out.println(stateName);

        String abbrevation = UsStates.getAbbrevationFromCapital("Atlanta");
        System.out.println(abbrevation);

    }


}
