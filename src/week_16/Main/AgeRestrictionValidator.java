package week_16.Main;

public class AgeRestrictionValidator {
    private static final int MIN_AGE = 18;
    private static final int MAX_AGE = 65;
    /**
     * At first we have to validate that if the user's age is in the legal range of age-restricted content.
     * @param age is age of the user...
     * @return true If ıt is ın the legal rang,otherwise return false...
     */
    public boolean isValid(int age){
        return age <= MIN_AGE && age <= MAX_AGE;
    }
}
