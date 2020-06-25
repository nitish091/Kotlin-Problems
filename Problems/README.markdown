For this assignment, we will try to automate the different morning tasks which most of us
perform before going to class in college. We will create a Robot which will perform these tasks
for us to simplify our lives.<br>
Every day in the morning we need to complete some set of predefined tasks that remain
constant. We can list the generic tasks as below:<br>
1. Ring the alarm on time<br>
2. Make coffee<br>
3. Heat the water to a suitable temperature<br>
4. Pack your bag (Keep only appropriate books for the day)<br>
5. Cook breakfast and lunch<br>
6. Iron the clothes<br>
From now on a Kotlin Robot will complete the above set of tasks for us.<br>


SPECIFICATIONS:<br>
About the Robot:<br>
Consider the Robot as your personal assistant. You will give the Robot a name by which you will
call it.<br>
You also need to define the functions performed by the Robot.<br> 
These functions will be the same as above i.e. the tasks which it will perform for you in the morning. Feel free to
add/modify the above-listed tasks as per your choice.<br>


Ring the alarm:<br>
The Robot will ring the alarm every day at a specified time which will be set by you. You also
need to set the days on which the alarm will not ring.<br>

Make coffee:<br>
The Robot will make coffee for you every day. You need to tell the Robot about the following
details:<br>
  1. How do you like your coffee (Black/With Milk).<br>
  2. How much sugar you’ll take.<br>
You can also customize the preferences according to the day of the week.<br>

Heat the water:<br>
You need to tell the Robot about the temperature you like for your bathing water. Additional
information which can be added is whether you’ll be bathing on a particular day or not.
Although, we recommend that you take baths every day ;).<br>

Pack your bag:<br>
The Robot will keep the books in your bag as per your timetable. You need to input the
timetable into your Robot’s memory so that it works accordingly.<br>

Cook breakfast and lunch:<br>
The Robot will cook your food according to your taste. You can let the Robot know which food
items do you like for breakfast and lunch and it will choose randomly from the list provided by
you. Here is a tip for you. To randomly choose an option from a list you can use the .random()
method on the list.<br>

Iron the clothes:<br>
Just tell the Robot what you want to wear before taking the bath and the clothes will be ready
for you as soon as you come out after bathing.<br>


The above tasks done by the Robot will surely simplify your life. As most of the work will be
done by your Robot, you can choose to have an extra hour of sleep. However, make sure to give
the commands to the Robot before you sleep for the night, else everything will be ruined and
you’ll be late for the class.<br>


To make the Robot, you need to create a project in Kotlin that will be responsible for all the
above-listed tasks. Just recall the concepts taught to you in this module and try to approach the
problem keeping those concepts in mind. So put your programming hats on, it’s time to get the
work done and sleep a bit more every day.<br>


Cheat Sheet:<br>
1. For making the Robot, create a class Robot and give its name as a primary parameter.<br>
2. The tasks performed by the Robot will become the functions of this class. Each function<br>
will simply print the tasks being performed.<br>
3. The variants for each function will become the parameters of those functions. For
storing similar items, try to make use of ArrayList and its functions.<br>
4. After this use the object-oriented techniques using this Robot class in your main
function.<br>
5. Also, for some detailed objects like ingredients for coffee, create a data class Coffee and
put its parameters in those. You can do this for other functions as well.<br>
