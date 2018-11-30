package com.ashu.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Map;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;



public class Main {

	public static void main(String[] args) {

		List<Fruit> fruit=new ArrayList<Fruit>();
		List<News> news=new ArrayList<News>();
		List<Transaction> transact=new ArrayList<Transaction>();
		List<Trader> trader=new ArrayList<Trader>();

		fruit.add(new Fruit("Mango", 100, 150, "green"));
		fruit.add(new Fruit("orange", 180, 250, "orange"));
		fruit.add(new Fruit("Banana", 90, 50, "yellow"));
		fruit.add(new Fruit("Papaya", 95, 45, "green"));
		fruit.add(new Fruit("Apple", 90, 50, "red"));
		fruit.add(new Fruit("Beat", 100, 45, "red"));
		fruit.add(new Fruit("Etc", 85, 60, "red"));

		news.add(new News(5,"Ashu", "Sidd", "Budget"));
		news.add(new News(7,"Manish", "ashu", "Hello"));
		news.add(new News(9,"Ashu", "chaya", "Bye"));
		news.add(new News(5,"Ashu", "madhuri", "Budget"));
		news.add(new News(5,"Manish", "asutosh", "Hello"));
		news.add(new News(5,"Ashu", "sidd", "Budget"));
		news.add(new News(7,"Ashu", "vijay", "Hii"));
		news.add(new News(15,"Manish", "manish", "Hello"));
		news.add(new News(9,"Ashu", "manish", "Budget"));

		Trader t1=new Trader("Ashutosh", "bangalore");
		Trader t2=new Trader("Sidd", "pune");
		Trader t3=new Trader("Vijay", "delhi");
		Trader t4=new Trader("Chaya", "mumbai");
		Trader t5=new Trader("Madhuri", "delhi");

		transact.add(new Transaction(t1, 2011, 100));
		transact.add(new Transaction(t2, 2012, 100));
		transact.add(new Transaction(t3, 2011, 10));
		transact.add(new Transaction(t4, 2011, 1000));
		transact.add(new Transaction(t5, 2015, 100));

		//for(Fruit view:fruit)
		//System.out.println(view);
		System.out.println("1------------");
		List<Fruit> cal=fruit.stream()
				.filter(x->x.getCalories()<100)
				.sorted(Comparator.comparing(Fruit::getCalories).reversed())
				.collect(Collectors.toList());
		System.out.println(cal);
		System.out.println("2------------");
		List<Fruit> color=fruit.stream()
				.sorted(Comparator.comparing(Fruit::getColor))
				.collect(Collectors.toList());
		System.out.println(color);
		System.out.println("3------------");
		List<Fruit> red=fruit.stream()
				.filter(x->x.getColor()=="red")
				.sorted(Comparator.comparing(Fruit::getPrice))
				.collect(Collectors.toList());
		System.out.println(red);
		System.out.println("5------------");
		System.out.println("number of times budget repeated is "+news.stream()
				.filter(n->n.getComment().contains("Budget"))
				.count());

		System.out.println("7------------");
		Map<String, Long> map=((Map<String, Long>) news.stream().map(n->n.getCommentByUser())
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting())));
		System.out.println(map);

		System.out.println("8----------");
		transact.stream()
		.filter(n->n.getYear()==2011)
		.sorted(Comparator.comparing(Transaction::getValue))
		.map(r->r.getTrader()+"::"+ r.getYear())
		.forEach(System.out::println);
		
		System.out.println("9----------");
		transact.stream()
		.map(n->n.getTrader().getCity()).distinct()
		.forEach(System.out::println);

		System.out.println("10----------");
		transact.stream()
		.filter(n->n.getTrader().getCity()=="pune")
		.map(n->n.trader.getName())
		.sorted()
		.forEach(t->System.out.println(" "+t));
		
		System.out.println("11----------");
		transact.stream()
		.map(n->n.trader.getName())
		.distinct()
		.sorted()
		.forEach(t->System.out.println(" "+t));
		
		System.out.println("12----------");
		boolean answer=transact.stream()
		.anyMatch(n->n.trader.getCity()=="Indore");
		System.out.println("Any from indore "+answer);
		
		System.out.println("13----------");
		
		transact.stream()
		.filter(t->t.getTrader().getCity()=="delhi")
		.map(n->n.trader.getName())
		.sorted()
		.forEach(t->System.out.println("traders from delhi is "+t));
		
		System.out.println("14----------");
		
		Transaction max=transact.stream()
				
				.max(Comparator.comparing(Transaction::getValue)).get();
				
				System.out.println(max);
				
				System.out.println("15----------");
				
				Transaction min=transact.stream()
						.min(Comparator.comparing(Transaction::getValue)).get();
						System.out.println(min);
				
	}

}
