package Flowers;

public class Bouquet {
   private final Flower[] flowers;
   private final String wrapper;
   private final String tapeColor;

    public Bouquet(Flower[] flowers) {
        this(flowers, null, null);
    }

    public Bouquet(Flower[] flowers, String wrapper, String tapeColor) {
        if (flowers == null) {
            this.flowers = new Flower[0];
        } else {
            this.flowers = flowers;
        }

        if (wrapper == null || wrapper.isBlank() || wrapper.isEmpty()) {
            this.wrapper = "подарочная";
        } else {
            this.wrapper = wrapper;
        }

        if (tapeColor == null || tapeColor.isBlank() || tapeColor.isEmpty()) {
            this.tapeColor = "красной";
        } else {
            this.tapeColor = tapeColor;
        }
    }

    public static double costBouquet(Flower[] flowers) {
        double sum = 0;
        for (Flower flower : flowers) {
            sum += flower.getCost();
        }
        double floristJob = sum * 0.1;
        return sum + floristJob;
    }

    public static int shelfLifeOfTheBouquet(Flower[] flowers) {
        int shelfLife = Integer.MAX_VALUE;
        for (Flower flower : flowers) {
            if (shelfLife > flower.getLifeSpan()) {
                shelfLife = flower.getLifeSpan();
            }
        }
        return shelfLife;
    }

    private String listOfFlowersOfTheBouquet(Flower[] flowers) {
        StringBuilder listOfFlowers = null;
        for (int i = 0; i < flowers.length; i++) {
            if (listOfFlowers == null) {
                listOfFlowers = new StringBuilder((flowers[i].getName() + ", "));
            } else {
                if (i == flowers.length - 1) {
                    listOfFlowers.append(flowers[i].getName()).append(". ");
                } else {
                    listOfFlowers.append(flowers[i].getName()).append(", ");
                }
        }
        }
        return listOfFlowers.toString();
    }

    @Override
    public String toString() {
        return String.format("Букет из цветов: (" + listOfFlowersOfTheBouquet(flowers) + ") упаковка " + wrapper + ", обвязан - " + tapeColor + " лентой");
    }
}
