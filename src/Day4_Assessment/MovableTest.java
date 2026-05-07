package Day4_Assessment;

interface Movable {
	void moveUp();
	void moveDown();
	void moveLeft();
	void moveRight();
}

class MovablePoint implements Movable{
	int x;
	int y;
	int xSpeed;
	int ySpeed;
	
	public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
		this.x = x;
		this.y = y;
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}
	
	@Override
	public void moveUp() {
		y += ySpeed;
	}
	
	@Override
	public void moveDown() {
		y -= ySpeed;
	}
	
	@Override
	public void moveRight() {
		x += xSpeed;
	}
	
	@Override
	public void moveLeft() {
		x -= xSpeed;
	}
	
	public String toString() {
		return "Point(" + x + ", " + y + ")";
	}
}

class MovableCircle implements Movable{
	int radius;
	MovablePoint center;
	
	public MovableCircle(int radius, MovablePoint center) {
		this.radius = radius;
		this.center = center;
	}
	
	@Override
	public void moveUp() {
		center.moveUp();
	}
	
	@Override
	public void moveDown() {
		center.moveDown();
	}
	
	@Override
	public void moveLeft() {
		center.moveLeft();
	}
	
	@Override
	public void moveRight() {
		center.moveRight();
	}
	
	public String toString() {
        return "Circle Center: " + center + ", Radius: " + radius;
    }
}

class MovableRectangle implements Movable{
	MovablePoint topLeft;
	MovablePoint bottomRight;
	
	public MovableRectangle(MovablePoint topLeft, MovablePoint bottomRight) {
		if(topLeft.xSpeed != bottomRight.xSpeed || topLeft.ySpeed != bottomRight.ySpeed) {
			throw new IllegalArgumentException("Provide same speed");
		}
		this.topLeft = topLeft;
		this.bottomRight = bottomRight;
	}
	
	public void moveUp() {
        topLeft.moveUp();
        bottomRight.moveUp();
    }

    public void moveDown() {
        topLeft.moveDown();
        bottomRight.moveDown();
    }

    public void moveLeft() {
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }

    public void moveRight() {
        topLeft.moveRight();
        bottomRight.moveRight();
    }
	
	 public String toString() {
	        return "Rectangle TopLeft: " + topLeft + ", BottomRight: " + bottomRight;
	    }
}

public class MovableTest {

	public static void main(String[] args) {
		MovablePoint p = new MovablePoint(0, 0, 4, 4);
        System.out.println(p);
        p.moveRight();
        p.moveUp();
        System.out.println("After Move: " + p);

        MovableCircle c = new MovableCircle(5, new MovablePoint(1, 1, 1, 1));
        System.out.println(c);
        c.moveUp();
        c.moveRight();
        System.out.println("After Move: " + c);

        MovableRectangle r = new MovableRectangle(
                new MovablePoint(0, 0, 2, 2),
                new MovablePoint(4, 4, 2, 2)
        );
        System.out.println(r);
        r.moveDown();
        r.moveLeft();
        System.out.println("After Move: " + r);

	}

}
