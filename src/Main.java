public class Main {
    public static void main(String[] args) {

        int account = 200;
        int replenishment = 1200;
        int inTotal = account + replenishment;
        System.out.println("Total on the account:" + inTotal);

        int bonus = 1;
        int bonuses = replenishment / 100 * bonus;

        if (replenishment > 100) {

            bonuses = replenishment / 100 * bonus;
        }

        System.out.println("Number of bonus rubles:" + bonuses);
    }
}