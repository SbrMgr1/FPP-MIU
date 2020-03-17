package com.fpp.AssLession_8;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main();
	}

	public Main() {
		Scanner input = new Scanner(System.in);

		LinkedList<Character> linkedListA = new LinkedList<Character>();
		
		LinkedList<Character> linkedListB = new LinkedList<Character>();
		LinkedList<Character> linkedListC = new LinkedList<Character>();

		LinkedList<Character> firstList = new LinkedList<Character>();
		LinkedList<Character> secondList = new LinkedList<Character>();

		boolean running = true;
		boolean runningR = true;
		boolean runningCLR = true;
		boolean runningL = true;
		boolean runningE = true;
		boolean runningCON = true;
		boolean runningI = true;
		boolean runningS = true;
		boolean runningD = true;
		boolean runningSUB = true;

		String decision;

		while (running) {

			System.out.println("Please select an options below.");

			System.out.println("R: Read \t W: Write \t\t CLR: Clear \t\tE: Equal");
			System.out.println("L: Length \t CON: Concatenate \t I: Insert \t\tS: Search");
			System.out.println("D: Delete \t SUB: Substring \t Q:QUIT");

			String optionChosen = input.next();

			switch (optionChosen) {
			case "R":
				runningR = true;
				while (runningR) {
					System.out.println("Enter the string name(A/B/C)");
					String str = input.next();
					switch (str) {
					case "A":
						linkedListA = this.Readstring("A");
						System.out.println("Your input has been saved to A. Do you want to read more input(Y/N)?");
						while (true) {
							decision = input.next();
							if (decision.equals("N")) {
								runningR = false;
								break;
							} else if (decision.equals("Y")) {
								break;
							} else if (!decision.equals("Y")) {
								System.out.println("Invalid input.");
							}
						}
						break;
					case "B":
						linkedListB = this.Readstring("B");
						System.out.println("Your input has been saved to B. Do you want to read more input(Y/N)?");
						while (true) {
							decision = input.next();
							if (decision.equals("N")) {
								runningR = false;
								break;
							} else if (decision.equals("Y")) {
								break;
							} else if (!decision.equals("Y")) {
								System.out.println("Invalid input.");
							}
						}
						break;
					case "C":
						linkedListC = this.Readstring("C");
						System.out.println("Your input has been saved to C. Do you want to read more input(Y/N)?");
						while (true) {
							decision = input.next();
							if (decision.equals("N")) {
								runningR = false;
								break;
							} else if (decision.equals("Y")) {
								break;
							} else if (!decision.equals("Y")) {
								System.out.println("Invalid input.");
							}
						}
						break;
					case "Q":
						runningR = false;
						running = false;
						optionChosen = "Q";
						break;

					default:
						System.out.println("Invalid option choosed.");
						break;
					}
				}
				break;
			case "W":

				System.out.println("A is containing:" + Writestring(linkedListA));
				System.out.println("B is containing:" + Writestring(linkedListB));
				System.out.println("C is containing:" + Writestring(linkedListC));

				break;
			case "CLR":
				runningCLR = true;
				while (runningCLR) {
					System.out.println("Which string do you want to clear?(A/B/C)");
					String str = input.next();
					switch (str) {
					case "A":
						linkedListA = this.Clear(linkedListA);
						System.out.println("A has been cleared. Do you want to clear more string(Y/N)?");
						while (true) {
							decision = input.next();
							if (decision.equals("N")) {
								runningCLR = false;
								break;
							} else if (decision.equals("Y")) {
								break;
							} else if (!decision.equals("Y")) {
								System.out.println("Invalid input.");
							}
						}
						break;
					case "B":
						linkedListB = this.Clear(linkedListB);
						System.out.println("B has been cleared. Do you want to clear more string(Y/N)?");
						while (true) {
							decision = input.next();
							if (decision.equals("N")) {
								runningCLR = false;
								break;
							} else if (decision.equals("Y")) {
								break;
							} else if (!decision.equals("Y")) {
								System.out.println("Invalid input.");
							}
						}
						break;
					case "C":
						linkedListC = this.Clear(linkedListC);
						System.out.println("B has been cleared. Do you want to clear more string(Y/N)?");
						while (true) {
							decision = input.next();
							if (decision.equals("N")) {
								runningCLR = false;
								break;
							} else if (decision.equals("Y")) {
								break;
							} else if (!decision.equals("Y")) {
								System.out.println("Invalid input.");
							}
						}
						break;
					case "Q":
						runningCLR = false;
						running = false;
						optionChosen = "Q";
						break;

					default:
						System.out.println("Invalid option choosed.");
						break;
					}
				}
				break;
			case "L":

				runningL = true;
				while (runningL) {
					System.out.println("Choose the string to see the length (A/B/C)");
					String str = input.next();
					switch (str) {
					case "A":
						System.out.println("Length of A is " + Len(linkedListA)
								+ ". Do you want to see the length of more string(Y/N)?");
						while (true) {
							decision = input.next();
							if (decision.equals("N")) {
								runningL = false;
								break;
							} else if (decision.equals("Y")) {
								break;
							} else if (!decision.equals("Y")) {
								System.out.println("Invalid input.");
							}
						}
						break;
					case "B":
						System.out.println("Length of B is " + Len(linkedListB)
								+ ". Do you want to see the length of more string(Y/N)?");
						while (true) {
							decision = input.next();
							if (decision.equals("N")) {
								runningL = false;
								break;
							} else if (decision.equals("Y")) {
								break;
							} else if (!decision.equals("Y")) {
								System.out.println("Invalid input.");
							}
						}
						break;
					case "C":
						System.out.println("Length of C is " + Len(linkedListC)
								+ ". Do you want to see the length of more string(Y/N)?");
						while (true) {
							decision = input.next();
							if (decision.equals("N")) {
								runningL = false;
								break;
							} else if (decision.equals("Y")) {
								break;
							} else if (!decision.equals("Y")) {
								System.out.println("Invalid input.");
							}
						}
						break;
					case "Q":
						runningL = false;
						running = false;
						optionChosen = "Q";
						break;

					default:
						System.out.println("Invalid option choosed.");
						break;
					}
				}

				break;

			case "E":
				runningE = true;
				firstList = new LinkedList<Character>();
				secondList = new LinkedList<Character>();
				while (runningE) {
					System.out.println("Choose first string.(A/B/C)");
					String firstStr;
					while (true) {
						firstStr = input.next();
						if (firstStr.equals("A")) {
							firstList = linkedListA;
							break;
						} else if (firstStr.equals("B")) {
							firstList = linkedListB;
							break;
						} else if (firstStr.equals("C")) {
							firstList = linkedListC;
							break;
						} else {
							System.out.println("Invalid input.");
						}
					}
					System.out.println("Choose second string.(A/B/C)");

					while (true) {
						String secondStr = input.next();
						if (secondStr.equals("A")) {
							secondList = linkedListA;
							break;
						} else if (secondStr.equals("B")) {
							secondList = linkedListB;
							break;
						} else if (secondStr.equals("C")) {
							secondList = linkedListC;
							break;
						} else {
							System.out.println("Invalid input.");
						}
					}
					System.out.println("Result of Equal:" + this.Equal(firstList, secondList) + "."
							+ "\nDo you want to check equal between other string(Y/N)?");
					while (true) {
						decision = input.next();
						if (decision.equals("N")) {
							runningE = false;
							break;
						} else if (decision.equals("Y")) {
							break;
						} else if (!decision.equals("Y")) {
							System.out.println("Invalid input.");
						}
					}
				}

				break;

			case "CON":

				runningCON = true;
				firstList = new LinkedList<Character>();
				secondList = new LinkedList<Character>();
				while (runningCON) {
					System.out.println("Choose first string.(A/B/C)");
					String firstStr;
					while (true) {
						firstStr = input.next();
						if (firstStr.equals("A")) {
							firstList = linkedListA;
							break;
						} else if (firstStr.equals("B")) {
							firstList = linkedListB;
							break;
						} else if (firstStr.equals("C")) {
							firstList = linkedListC;
							break;
						} else {
							System.out.println("Invalid input.");
						}
					}
					System.out.println("Choose second string.(A/B/C)");

					while (true) {
						String secondStr = input.next();
						if (secondStr.equals("A")) {
							secondList = linkedListA;
							break;
						} else if (secondStr.equals("B")) {
							secondList = linkedListB;
							break;
						} else if (secondStr.equals("C")) {
							secondList = linkedListC;
							break;
						} else {
							System.out.println("Invalid input.");
						}
					}
					System.out.println("Result of Concatination:" + this.Concatenate(firstList, secondList) + "."
							+ "\nDo you want to concat between other string(Y/N)?");
					while (true) {
						decision = input.next();
						if (decision.equals("N")) {
							runningCON = false;
							break;
						} else if (decision.equals("Y")) {
							break;
						} else if (!decision.equals("Y")) {
							System.out.println("Invalid input.");
						}
					}
				}

				break;
			case "I":

				runningI = true;
				firstList = new LinkedList<Character>();
				secondList = new LinkedList<Character>();
				while (runningI) {
					System.out.println("Choose first string.(A/B/C)");
					String firstStr;
					while (true) {
						firstStr = input.next();
						if (firstStr.equals("A")) {
							firstList = linkedListA;
							break;
						} else if (firstStr.equals("B")) {
							firstList = linkedListB;
							break;
						} else if (firstStr.equals("C")) {
							firstList = linkedListC;
							break;
						} else {
							System.out.println("Invalid input.");
						}
					}
					System.out.println("Choose second string.(A/B/C)");

					while (true) {
						String secondStr = input.next();
						if (secondStr.equals("A")) {
							secondList = linkedListA;
							break;
						} else if (secondStr.equals("B")) {
							secondList = linkedListB;
							break;
						} else if (secondStr.equals("C")) {
							secondList = linkedListC;
							break;
						} else {
							System.out.println("Invalid input.");
						}
					}

					System.out.println("Enter the position of target list to insert a copy of first list");
					int pos = input.nextInt();

					System.out.println("Result of Concatination:" + this.Insert(firstList, secondList, pos) + "."
							+ "\nDo you want to insert for other string(Y/N)?");
					while (true) {
						decision = input.next();
						if (decision.equals("N")) {
							runningI = false;
							break;
						} else if (decision.equals("Y")) {
							break;
						} else if (!decision.equals("Y")) {
							System.out.println("Invalid input.");
						}
					}
				}

				break;

			case "S":
				runningS = true;
				firstList = new LinkedList<Character>();
				while (runningS) {
					System.out.println("Choose a string.(A/B/C)");
					String firstStr;
					while (true) {
						firstStr = input.next();
						if (firstStr.equals("A")) {
							firstList = linkedListA;
							break;
						} else if (firstStr.equals("B")) {
							firstList = linkedListB;
							break;
						} else if (firstStr.equals("C")) {
							firstList = linkedListC;
							break;
						} else {
							System.out.println("Invalid input.");
						}
					}

					System.out.println("Enter a character to search.");
					char ch = input.next().charAt(0);

					System.out.println("Enter the position from which given character is started to search");
					int pos = input.nextInt();

					System.out.println("Result of search:" + Search(ch, firstList, pos) + "."
							+ "\nDo you want to search into other string(Y/N)?");
					while (true) {
						decision = input.next();
						if (decision.equals("N")) {
							runningS = false;
							break;
						} else if (decision.equals("Y")) {
							break;
						} else if (!decision.equals("Y")) {
							System.out.println("Invalid input.");
						}
					}
				}

				break;
			case "D":
				runningD = true;
				firstList = new LinkedList<Character>();
				while (runningD) {
					System.out.println("Choose a string.(A/B/C)");
					String firstStr;
					while (true) {
						firstStr = input.next();
						if (firstStr.equals("A")) {
							firstList = linkedListA;
							break;
						} else if (firstStr.equals("B")) {
							firstList = linkedListB;
							break;
						} else if (firstStr.equals("C")) {
							firstList = linkedListC;
							break;
						} else {
							System.out.println("Invalid input.");
						}
					}

					System.out.println("Enter a position from where to start to delete.");
					int start = input.nextInt();

					System.out.println("Enter the number of character to delete");
					int span = input.nextInt();

					System.out.println("Now string contains :" + Delete(firstList, start, span) + "."
							+ "\nDo you want to delete characters of other string(Y/N)?");
					while (true) {
						decision = input.next();
						if (decision.equals("N")) {
							runningD = false;
							break;
						} else if (decision.equals("Y")) {
							break;
						} else if (!decision.equals("Y")) {
							System.out.println("Invalid input.");
						}
					}
				}
				break;

			case "SUB":
				runningSUB = true;
				firstList = new LinkedList<Character>();
				secondList = new LinkedList<Character>();
				while (runningSUB) {
					System.out.println("Choose first string.(A/B/C)");
					String firstStr;
					while (true) {
						firstStr = input.next();
						if (firstStr.equals("A")) {
							firstList = linkedListA;
							break;
						} else if (firstStr.equals("B")) {
							firstList = linkedListB;
							break;
						} else if (firstStr.equals("C")) {
							firstList = linkedListC;
							break;
						} else {
							System.out.println("Invalid input.");
						}
					}
					System.out.println("Choose target string.(A/B/C)");

					while (true) {
						String secondStr = input.next();
						if (secondStr.equals("A")) {
							secondList = linkedListA;
							break;
						} else if (secondStr.equals("B")) {
							secondList = linkedListB;
							break;
						} else if (secondStr.equals("C")) {
							secondList = linkedListC;
							break;
						} else {
							System.out.println("Invalid input.");
						}
					}
					System.out.println("Enter a position from where to start.");
					int start = input.nextInt();

					System.out.println("Enter the number as span");
					int span = input.nextInt();

					Substring(secondList, firstList, start, span);
					System.out
							.println("Result :" + secondList + "." + "\nDo you want to play substring between other strings(Y/N)?");
					while (true) {
						decision = input.next();
						if (decision.equals("N")) {
							runningSUB = false;
							break;
						} else if (decision.equals("Y")) {
							break;
						} else if (!decision.equals("Y")) {
							System.out.println("Invalid input.");
						}
					}
				}
				break;
			case "Q":
				running = false;
				break;

			default:

				System.out.println("Invalid option chosed.");

				break;
			}

		}

	}

	/**
	 * reads in a string from the terminal.
	 * 
	 * @return
	 */
	private LinkedList<Character> Readstring(String type) {
		LinkedList<Character> linkedList = new LinkedList<Character>();
		System.out.println("Enter any string for " + type + ".");
		Scanner input = new Scanner(System.in);
		String terminalVal = input.next();
		for (int i = 0; i < terminalVal.length(); i++) {
			linkedList.add(terminalVal.charAt(i));
		}
		return linkedList;
	}

	/**
	 * writes a LinkedList to the terminal.
	 */
	private String Writestring(LinkedList<Character> linkedList) {
		if (linkedList == null) {
			return null;
		}
		StringBuffer buffer = new StringBuffer();

		Iterator<Character> iterator = linkedList.iterator();
		while (iterator.hasNext()) {
			buffer.append(iterator.next());
		}
		return buffer.toString();
	}

	/**
	 * initializes a LinkedList to null
	 * 
	 * @param linkedList
	 * @return
	 */
	private LinkedList<Character> Clear(LinkedList linkedList) {
		if (linkedList == null) {
			return null;
		}
		linkedList.clear();
		return linkedList;
	}

	/**
	 * returns the length of a LinkedList. Use an Iterator for this method.
	 * 
	 * @param list
	 * @return
	 */
	private int Len(LinkedList<Character> list) {

		if (list == null) {
			return 0;
		}
		int count = 0;
		Iterator<Character> iterator = list.iterator();
		while (iterator.hasNext()) {
			count++;
			iterator.next();
		}
		return count;
	}

	/**
	 * tests whether or not two LinkedLists are equal. Use two Iterators for this
	 * method, one for each list.
	 * 
	 * @param linkedList
	 * @param linkedList2
	 * @return
	 */
	private Boolean Equal(LinkedList<Character> linkedList, LinkedList<Character> linkedList2) {
		if (linkedList == null && linkedList2 == null) {
			return true;
		} else if (linkedList == null || linkedList2 == null) {
			return false;
		} else if (linkedList.size() != linkedList2.size()) {
			return false;
		} else {

			boolean result = true;
			Iterator<Character> iterator = linkedList.iterator();
			Iterator<Character> iterator2 = linkedList2.iterator();
			while (iterator.hasNext()) {
				if (iterator.next() != iterator2.next()) {
					result = false;
				}
			}

			return result;
		}

	}

	/**
	 * concatenates a copy of the LinkedList onto target LinkedList
	 * 
	 * @param linkedList
	 * @param linkedList2
	 * @return LinkedList<Character>
	 */
	private LinkedList<Character> Concatenate(LinkedList<Character> linkedList, LinkedList<Character> linkedList2) {
		Iterator<Character> iterate = linkedList2.iterator();
		while (iterate.hasNext()) {
			linkedList.add(iterate.next());
		}
		return linkedList;
	}

	/**
	 * inserts a copy of the LinkedList into target LinkedList after position start
	 * 
	 * @param linkedlist
	 * @param target
	 * @param start
	 * @return
	 */
	private LinkedList<Character> Insert(LinkedList<Character> linkedlist, LinkedList<Character> target, int start) {
		if (linkedlist == null || target == null) {
			return null;
		} else {
			Iterator<Character> its = linkedlist.iterator();
			while (its.hasNext()) {
				target.add(start, its.next());
				start++;
			}
		}

		return target;
	}

	private int Search(Character charcter, LinkedList<Character> targetList, int start) {
		int result = -1;
		if (targetList == null || charcter == null || start < 0) {
			return result;
		}
		Iterator it = targetList.iterator();
		int counter = 0;
		char tmp;
		while (it.hasNext()) {
			tmp = (Character) it.next();
			if (counter >= start) {
				if (tmp == charcter) {
					result = counter;
					break;
				}
			}
			counter++;
		}
		return result;
	}

	/**
	 * deletes a portion of a LinkedList starting at position start for a length of
	 * span
	 * 
	 * @param list
	 * @param start
	 * @param span
	 * @return
	 */
	private LinkedList<Character> Delete(LinkedList<Character> list, int start, int span) {
		if (start < 0) {
			throw new IllegalArgumentException("Second Arguement can not be smaller than zero.");
		}
		if (span < 0) {
			throw new IllegalArgumentException("Third Arguement can not be smaller than zero.");
		}
		if (list == null) {
			return null;
		}
		int target = start + span;

		Iterator it = list.iterator();
		int count = 0;

		while (it.hasNext()) {
			it.next();
			if (count >= start && count < target) {
				it.remove();
			}
			count++;

		}

		return list;
	}

	/**
	 * target LinkedList is assigned a portion of linkedList2 starting at position
	 * start for a length of span.
	 * 
	 * @param target
	 * @param linkedList2
	 * @param start
	 * @param span
	 */
	private void Substring(LinkedList<Character> target, LinkedList<Character> linkedList2, int start, int span) {
		if (start < 0) {
			throw new IllegalArgumentException("Second Arguement can not be smaller than zero.");
		}
		if (span < 0) {
			throw new IllegalArgumentException("Third Arguement can not be smaller than zero.");
		}
		if (linkedList2 != null) {
			int targetPos = start + span;
			Iterator it = linkedList2.iterator();
			char ch;
			int count = 0;
			while (it.hasNext()) {
				ch = (Character) it.next();
				if (count >= start && count < targetPos) {
					target.add(ch);
				}
				count++;
			}

		}

	}

}
