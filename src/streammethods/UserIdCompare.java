package streammethods;

import java.util.Comparator;

public class UserIdCompare implements Comparator<User>{

	@Override
	public int compare(User o1, User o2) {
		return o1.getId()-(o2.getId());
	}

}
