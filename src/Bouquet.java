public class Bouquet {
    private Flower[] bouqet;
    private double bouqetCost = 0;

    public Bouquet(int size) {
        this.bouqet = new Flower[size];
    }

    public void addFlower(Flower flower){
        for (int i = 0; i < bouqet.length; i++) {
            if (bouqet[i] == null) {
                bouqet[i] = flower;
                return;
            }
        }
    }

    public Flower[] getBouqet() {
        return bouqet;
    }

    public String calculateBouqetCost(float  flowerCount[]) {
        int minLifeSpan = Integer.MAX_VALUE;
        String result;
        for (int i = 0; i < bouqet.length; i++) {
            if (bouqet[i] != null) {
                bouqetCost += bouqet[i].getCost() * flowerCount[i];
                if (bouqet[i].getLifeSpan() < minLifeSpan) {
                    minLifeSpan = bouqet[i].getLifeSpan();
                }
            }
        }
        bouqetCost += bouqetCost * 0.1;
        double roundOff = Math.round(bouqetCost * 100.0) / 100.0;
        this.bouqetCost = roundOff;
        result = "Стоимость  букета " + roundOff + " рублей, простоит " + minLifeSpan + " суток";
        return result;
    }

}
