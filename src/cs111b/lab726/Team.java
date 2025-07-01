package cs111b.lab726;

public class Team {
    private String name;
    private int wins;
    private int losses;

    public void setName(String name) {
        this.name = name;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }

    public String getName() {
        return name;
    }

    public int getWins() {
        return wins;
    }

    public int getLosses() {
        return losses;
    }

    public double getWinPercentage() {
        double result;
        double floatWins = (double) wins;
        double floatLosses = (double) losses;

        result = floatWins / (floatWins + floatLosses);
        return result;
    }

    public void printStanding() {
        double winPercentage = this.getWinPercentage();

        if (winPercentage < 0.5) {
            System.out.print("Win percentage: ");
            System.out.printf("%.2f", winPercentage);
            System.out.println("");
            System.out.println("Team " + name + " has a losing average.");
        } else {
            System.out.print("Win percentage: ");
            System.out.printf("%.2f", winPercentage);
            System.out.println("");
            System.out.println("Congratulations, Team " + name + " has a winning average!");
        }
    }

}