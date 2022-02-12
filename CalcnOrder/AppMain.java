import javax.swing.JFrame;


public class AppMain{
    PreviousOrders previousOrderPage = new PreviousOrders(this);
    Checkout checkoutPage=new Checkout(this, previousOrderPage);
    Review reviewPage = new Review(this, checkoutPage);
    JFrame frame;
    Register registrationPage = new Register(this);
    UserProfile userProfilePage;
    Games gamesPage = new Games(this);
    Restaurant res = new Restaurant("Calc'n Order", "Ankara, Bilkent");
    AddingDishToCart addingDishToCartPage = new AddingDishToCart(this, reviewPage);
    DishDetails dishDetailsPage = new DishDetails(this, addingDishToCartPage);
    BurgerMenu burgerMenuPage = new BurgerMenu(this, dishDetailsPage, res);
    PastaMenu pastaMenuPage = new PastaMenu(this, dishDetailsPage, res);
    PizzaMenu pizzaMenuPage = new PizzaMenu(this, dishDetailsPage, res);
    SaladMenu saladMenuPage = new SaladMenu(this, dishDetailsPage,res);
    SoupMenu soupMenuPage = new SoupMenu(this, dishDetailsPage, res);
    WrapMenu wrapMenuPage = new WrapMenu(this, dishDetailsPage, res);
    MainPage mainPage = new MainPage(this, reviewPage, res, dishDetailsPage);
    Login loginPage = new Login(this, mainPage);
    Categories categoriesPage = new Categories(this, mainPage, loginPage);
    HungryManGUI hangmanPage = new HungryManGUI(this, mainPage);
    LuckyFood luckyFoodPage = new LuckyFood(this, mainPage);
    MemoryGame memoryGame = new MemoryGame(this, mainPage);    

    public static void main(String[] args) {
 
        new AppMain(); 
    }
    public AppMain() {
        frame = new JFrame();
        frame.setBounds(100, 100, 900, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(loginPage);
        frame.setVisible(true);
        frame.setResizable(false);

    }


}