public class Triangle extends Figure{
    int a;
    int b;
    int c;

    Triangle (int a,int b, int c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public boolean isValid() {
        return a > 0 && b > 0 && c > 0 && ((a + b) > c && (a + c) > b && (b + c) > a);
    }

    @Override
    public void getArea() {
        if (isValid()) {
            int s = (a + b + c) / 2;
            area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
            System.out.printf("Triangle area is %f \n", area);
        } else {
            System.out.println("Triangle with entered sides doesn't exist");
        }
    }
}
