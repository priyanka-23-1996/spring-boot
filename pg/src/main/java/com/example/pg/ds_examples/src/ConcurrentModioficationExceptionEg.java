import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ConcurrentModioficationExceptionEg {

	public static void main(String[] args) {
		List<Integer> l = new ArrayList();
		l.add(1);
		l.add(2);
		l.add(3);
		Iterator<Integer> i=l.iterator();
		while(i.hasNext()) {
		Integer num=	i.next();
		if(num < 3)
			//l.remove(num);
			i.remove();
		}
		System.out.println(l);

	}

}
