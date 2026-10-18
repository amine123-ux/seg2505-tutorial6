
package com.example.recyclerview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView =
                findViewById(R.id.recyclerViewCourses);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<Course> courses = new ArrayList<>();

        courses.add(new Course(
                "SEG2505",
                "Introduction to Software Engineering",
                "Learn software design, development, and testing."
        ));

        courses.add(new Course(
                "CSI2510",
                "Data Structures and Algorithms",
                "Explore data structures and algorithm analysis."
        ));

        courses.add(new Course(
                "CEG2536",
                "Computer Architecture I",
                "Learn how computer systems and processors work."
        ));

        courses.add(new Course(
                "GNG2501",
                "Introduction to Product Development",
                "Explore engineering design and product development."
        ));

        courses.add(new Course(
                "CHM1711",
                "Principles of Chemistry",
                "Study chemistry concepts and laboratory methods."
        ));

        CourseAdapter adapter = new CourseAdapter(courses);
        recyclerView.setAdapter(adapter);
    }
}
