package generics;

import java.util.ArrayList;
import java.util.List;

public class Test2 {
    X x = new Y();
//    List<X> list1 = new ArrayList<Y>();
}

class X {
}

class Y extends X {
}
