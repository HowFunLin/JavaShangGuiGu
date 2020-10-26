package Collection.ExaminationRanking;

class Student implements Comparable<Student>
{
	private String name;
	private int score;
	private int id;
	
	public Student(String name, int score, int id)
	{
		this.name = name;
		this.score = score;
		this.id = id;
	}

	@Override
	public int compareTo(Student o)
	{
		if(this.score > o.score) return -1;
		else if(this.score == o.score) return 0;
		else return 1;
	}

	@Override
	public String toString()
	{
		return "Student [name=" + name + ", id=" + id +  "]";
	}
}
