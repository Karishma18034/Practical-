class Box {

private double width;

private double height;

private double depth;
/ construct clone of an object

Box (Box ob) { // pass object to constructor

width ob.width;

height ob.height;

}

depth ob.depth;

// constructor used when all dimensions specified Box (double w, double h, double d) {

width = w;

height = h;

depth = d;

}

// constructor used when no dimensions specified Box () {

width = -1; // use -1 to indicate

height = -1; // an uninitialized

depth = -1; // box

}

// constructor used when cube is created

Box (double len) {

width= height= depth = len;

}

// compute and return volume

double volume () {

return width * height * depth;

}

}

// Add weight.

class BoxWeight extends Box {

double weight; // weight of box.

// construct clone of an object

BoxWeight (BoxWeight ob) { // pass object to constructor super (ob);

weight = ob.weight;

}

// constructor when all parameters are specified BoxWeight (double w, double h, double d, doublem) { super (w, h, d); // call superclass constructor

weight = m;

}

// default constructor BoxWeight () { super(); weight = -1; }