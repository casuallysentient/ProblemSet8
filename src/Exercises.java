import java.lang.Math;

public class Exercises {

	public boolean commonEnd(int[] a, int[] b) {
		if (a == null || a.length == 0 || b == null || b.length == 0) {
			return false;
		}

		if (a[0] == b[0] || a[a.length - 1] == b[b.length - 1]) {
			return true;
		}

		return false;	// default return value to ensure compilation
	}

	public String[] endsMeet(String[] values, int n) {
		if (values == null || values.length < n || n <= 0) {
			return new String[0];
		}

		String[] newString = new String[n * 2];
		for (int i = 0; i < n; i++) {
			newString[i] = values[i];
		}

		int index = n;
		for (int i = values.length - n; i < values.length; i++) {
			newString[index] = values[i];
			index++;
		}

		return newString;
	}

	public int difference(int[] numbers) {
		if (numbers != null && numbers.length >= 1) {
			int maxValue = numbers[0];
			int minValue = numbers[0];
			for(int i : numbers) {
				if (i > maxValue) {
					maxValue = i;
				} else if (i < minValue) {
					minValue = i;
				}
			}
			int differenceOfValues = maxValue - minValue;
			return differenceOfValues;
		}

		return -1;		// default return value to ensure compilation
	}

	public double biggest(double[] numbers) {
		if (numbers != null && numbers.length >= 3 && numbers.length % 2 == 1) {
			boolean allPositive = true;
			for (double i : numbers) {
				if (i < 0) {
					allPositive = false;
				}
			}
			if (allPositive == true) {
				double firstValue = numbers[0];
				double lastValue = numbers[numbers.length - 1];
				int middleIndex = (int) Math.floor(numbers.length / 2);
				double middleValue = numbers[middleIndex];
				double biggestValue = firstValue;
				if (firstValue >= middleValue && firstValue >= lastValue) {
					biggestValue = firstValue;
				} else if (middleValue >= firstValue && middleValue >= lastValue) {
					biggestValue = middleValue;
				} else if (lastValue >= firstValue && lastValue >= middleValue) {
					biggestValue = lastValue;
				}
				return biggestValue;
			}
		}

		return -1;		// default return value to ensure compilation
	}

	public String[] middle(String[] values) {
		// write your code here

		return null;	// default return value to ensure compilation
	}

	public boolean increasing(int[] numbers) {
		// write your code here

		return false;	// default return value to ensure compilation
	}

	public boolean everywhere(int[] numbers, int x) {
		// write your code here

		return false;	// default return value to ensure compilation
	}

	public boolean consecutive(int[] numbers) {
		// write your code here

		return false;	// default return value to ensure compilation
	}

	public boolean balance(int[] numbers) {
		// write your code here

		return false;	// default return value to ensure compilation
	}

	public int clumps(String[] values) {
		// write your code here

		return -1;		// default return value to ensure compilation
	}
}
