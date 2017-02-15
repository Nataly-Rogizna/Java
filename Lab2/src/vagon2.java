public class vagon2 extends vagon{
    public void IzmenitxChisloMest(int NovoeChisloMest){
        ChisloMest = NovoeChisloMest;
    }

    public void ZanyatxMesto(int NomerMesta) {
        if (MestoZanyato(NomerMesta) == 1) {
            System.out.println("Это место уже занято!:" + NomerMesta + " (вагон №" + NomerEtogoVagona + ")!");
        }
        else {
            Mesta[NomerMesta - 1] = 1;
        }
    }

    public void VagonInfo() {
        int freePlaces = 0;
        int topPlaces = 0;
        int bottomPlaces = 0;
        System.out.println("Вагон №" + NomerEtogoVagona);
        for (int i = 0; i < ChisloMest; i++) {
            if (Mesta[i] == 0) {
                freePlaces++;
            }
        }
        System.out.println("Число свободных мест: " + freePlaces);
        System.out.println("Информация о свободных местах: ");
        for (int i = 0; i < ChisloMest; i++) {
            if (Mesta[i] == 0) {
                if (i % 2 == 0) {
                    topPlaces++;
                    System.out.print((i + 1) + "(top) ");
                } else {
                    bottomPlaces++;
                    System.out.print((i + 1) + "(bottom) ");
                }
            }
        }
        System.out.println("");
        System.out.println(topPlaces + " of top places");
        System.out.println(bottomPlaces + " of bottom places");
        System.out.println("");
    }
}
