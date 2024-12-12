public class Interface {
    public static void main(String[] args) {
        Queen q=new Queen();
        Rook r=new Rook();
        King k=new King();
        k.moves();
        q.moves();
        r.moves();
        
    }
    
}
interface Chessplayer{
    void moves();
}
class Queen implements Chessplayer{
    public void moves(){
        System.out.println("MOves in any direction");
    }
}
class Rook implements Chessplayer{
    public void moves(){
        System.out.println("MOves in Straight direction");
    }
}

class King implements Chessplayer{
    public void moves(){
        System.out.println("MOves in any direction by 1 step");
    }
}
