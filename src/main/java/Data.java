public class Data {
    // Instance variables amount, unit, and downloadSpeed
    private double amount;
    private String unit;
    private double downloadSpeed;

    // Constructor
    public Data(double amount, String unit, double downloadSpeed) {
        this.amount = amount;
        this.unit = unit;
        this.downloadSpeed = downloadSpeed;
    }

    // Class methods
    public double convertToMegabytes() {
        if (unit.equals("bytes")) {
            return amount / 1048576.0;
        } else if (unit.equals("kilobytes")) {
            return amount / 1024.0;
        } else if (unit.equals("megabytes")) {
            return amount;
        } else if (unit.equals("gigabytes")) {
            return amount * 1024.0;
        } else {
            throw new IllegalArgumentException("Invalid unit");
        }
    }

    public double calculateDownloadTime() {
        double megabytes = convertToMegabytes();
        double megabits = megabytes * 8.0;
        return megabits / downloadSpeed;
    }

    public String getFormattedDownloadTime() {
        double time = calculateDownloadTime();
        int minutes = (int) time;
        int seconds = (int) ((time - minutes) * 60);
        return minutes + " minutes " + seconds + " seconds";
    }

    // toString using Class methods
    @Override
    public String toString() {
        return "Data: " + amount + " " + unit + "\nDownload Time: " + getFormattedDownloadTime();
    }
}

