
package com.example.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CourseAdapter
        extends RecyclerView.Adapter<CourseAdapter.CourseViewHolder> {

    private final List<Course> courses;

    public CourseAdapter(List<Course> courses) {
        this.courses = courses;
    }

    public static class CourseViewHolder extends RecyclerView.ViewHolder {
        TextView textCourseCode;
        TextView textCourseTitle;
        TextView textCourseDescription;

        public CourseViewHolder(@NonNull View itemView) {
            super(itemView);
            textCourseCode = itemView.findViewById(R.id.textCourseCode);
            textCourseTitle = itemView.findViewById(R.id.textCourseTitle);
            textCourseDescription =
                    itemView.findViewById(R.id.textCourseDescription);
        }
    }

    @NonNull
    @Override
    public CourseViewHolder onCreateViewHolder(
            @NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_course, parent, false);
        return new CourseViewHolder(view);
    }

    @Override
    public void onBindViewHolder(
            @NonNull CourseViewHolder holder, int position) {
        Course course = courses.get(position);

        holder.textCourseCode.setText(course.getCode());
        holder.textCourseTitle.setText(course.getTitle());
        holder.textCourseDescription.setText(course.getDescription());

        holder.itemView.setOnClickListener(v ->
                Toast.makeText(
                        v.getContext(),
                        course.getCode() + " - " + course.getTitle(),
                        Toast.LENGTH_SHORT
                ).show()
        );
    }

    @Override
    public int getItemCount() {
        return courses.size();
    }
}
