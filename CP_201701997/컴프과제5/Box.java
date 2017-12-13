 public class Box {
	 
private int x;
private int y;
private int z;

void setX(int i) {
x = i;
}

int getX() {
return x;
}

void setY(int i) {
y = i;
}

int getY() {
return y;
}

void setZ(int i) {
z = i;
}

int getZ() {
return z;
}

int getVolume() {
return getX() * getY() * getZ();
}

void print() {
System.out.println("X: " + getX());
System.out.println("Y: " + getY());
System.out.println("Z: " + getZ());
}
}