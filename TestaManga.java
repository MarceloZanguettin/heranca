public class TestaManga {

    public static void main(String[] args) {

        Manga manga = new Manga();
        manga.setFolhas("Larga");
        manga.setPreco(5.59);
        manga.setRaizes("Possui");
        manga.setTronco(1);
        manga.setFruto("Possui");

        System.out.println(manga.getFolhas());
        System.out.println(manga.getPreco());
        System.out.println(manga.getRaizes());
        System.out.println(manga.getTronco());
        System.out.println(manga.getFruto());

    }
    
}
