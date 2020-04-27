package lviv.lgs.ua;

import java.util.Comparator;

public class DeputyBribeSizeComparator implements Comparator<Deputy> {

	@Override
	public int compare(Deputy o1, Deputy o2) {
		if (o1.getBribesSize() > o2.getBribesSize())
			return -1;
		else if (o1.getBribesSize() < o2.getBribesSize())
			return 1;
		else
			return 0;
	}

}
