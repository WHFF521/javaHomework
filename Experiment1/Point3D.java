package Experiment1;
class Point2D{
    protected int x,y;
    Point2D(int x,int y){
        this.x=x;
        this.y=y;
    }
    public void offset(int a,int b){
        this.x+=a;
        this.y+=b;
    }
    public int get_X(){
        return this.x;
    }
    public int get_Y(){
        return this.y;
    }
    public static double distance(Point2D p1,Point2D p2){
        double dis_X=Math.pow(p1.get_X()- p2.get_X(),2);
        double dis_Y=Math.pow(p1.get_Y()- p2.get_Y(),2);
        return Math.sqrt(dis_X+dis_Y);
    }

}
public class Point3D extends Point2D{
    public static void main(String[] args){
        Point2D p2d1=new Point2D(1,1);
        Point2D p2d2=new Point2D(2,2);
        double dis_2D=Point2D.distance(p2d1,p2d2);
        System.out.println("两个平面的点的距离是： "+dis_2D);

        Point3D p3d1=new Point3D(1,1,1);
        Point3D p3d2=new Point3D(2,2,2);
        double dis_3D=Point3D.distance(p3d1,p3d2);
        System.out.println("两个立体的点的距离是： "+dis_3D);
    }
    private int z;
    Point3D(int x,int y,int z){
        super(x,y);
        this.z=z;
    }
    Point3D(Point2D p,int z){
        super(p.get_X(),p.get_Y());
        this.z=z;
    }
    public void offset(int a,int b,int c){
        super.offset(a,b);
        this.z+=c;
    }
    public int get_Z(){
        return this.z;
    }

    public static double distance(Point3D p1,Point3D p2){
        double dis_X=Math.pow(p1.get_X()- p2.get_X(),2);
        double dis_Y=Math.pow(p1.get_Y()- p2.get_Y(),2);
        double dis_Z=Math.pow(p1.get_Z()- p2.get_Z(),2);
        return Math.sqrt(dis_X+dis_Y+dis_Z);
    }

}
