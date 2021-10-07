// Java supports nesting classes; a class can be a member of another class.
class Robot {
    int id;
    Robot(int i) {
        id = 1;
        Brain b = new Brain();
        b.think();
    }
    private class Brain {     // an inner class can be private 
        public void think() { // which cannot be accessed from an object outside the class
            System.out.println(id + " is thinking");
        }
    }
}
/*
    The class Robot has an inner class Brain. 
    The inner class can access all of the member variables and methods of its outer class, 
    but it cannot be accessed from any outside class.
*/