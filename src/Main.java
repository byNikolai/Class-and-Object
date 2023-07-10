public class Main {

    public static void main(String[] args) {
        Author liuCixin = new Author("Liu", "Cixin");
        Author romanProkofiev = new Author("Роман", "Прокофьев");
        Book theTreeBodyProblem = new Book(liuCixin, "The Three-body Problem", "Chongqing Press", 2008);
        Book catsGame = new Book(romanProkofiev, "Игра Кота", "Студия 1C", 2017);
        System.out.println("First Book author = " + liuCixin.getAuthorName()+ " " + liuCixin.getAuthorSurname() + " ** " + "First Book data = " + theTreeBodyProblem.getBookName() + ", " + theTreeBodyProblem.getPublisher() + ", " + theTreeBodyProblem.getPublishingYear());
        System.out.println("Second Book author = " + romanProkofiev.getAuthorName() + " " + romanProkofiev.getAuthorSurname() + " ** " + "Second Book data = " + catsGame.getBookName() + ", " + catsGame.getPublisher() + ", " + catsGame.getPublishingYear());
        catsGame.setPublishingYear(2018);
        System.out.println("Second Book author = " + romanProkofiev.getAuthorName() + " " + romanProkofiev.getAuthorSurname() + " ** " + "Second Book data = " + catsGame.getBookName() + ", " + catsGame.getPublisher() + ", " + catsGame.getPublishingYear());
    }
}