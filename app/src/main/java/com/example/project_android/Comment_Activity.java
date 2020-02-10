package com.example.project_android;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Comment_Activity extends AppCompatActivity {
    List<Comment>Comments;
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comment_);

        Intent intent = getIntent();

        final ArrayList<Comment>Comments = new ArrayList<>();
        Comments.add(new Comment("andrew_ski_maniac","I have been in Cortina and Chamonix,great experiences!"));
        Comments.add(new Comment("evil_queen","I loved the slopes in Solden.Excited for my ski trip this year in Cortina "));
        Comments.add(new Comment("miss_skiing_sweety","Best skiing in Kitzbuhel!Definitely going there again next year!"));
        Comments.add(new Comment("david_ski_conquerer","I loved skiing in Madonna!!! Next time I'm coming with my friends"));
        Comments.add(new Comment("alex123","Definitely coming back next year Solden!"));
        Comments.add(new Comment("didi_skiBo$$","Best view in Punta Rocca!!!!"));
        Comments.add(new Comment("anna","Sooooooo much fun skiing in Marmolada ski centre"));
        Comments.add(new Comment("roby_king","Very pleased with my ski trip this year in Chamonix"));

        mRecyclerView = (RecyclerView) findViewById(R.id.list);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(Comment_Activity.this);
        mAdapter = new Comment_Adapter(Comments);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);

        final EditText editText =(EditText) findViewById(R.id.editText);
        final EditText editText1 = (EditText) findViewById(R.id.ski_nickname);
        Button btn = (Button) findViewById(R.id.Button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String kom=editText.getText().toString();
                String ski_nickname=editText1.getText().toString();
                if (kom.length()==0)
                {
                    Toast.makeText(getApplicationContext(),"Please insert comment !", Toast.LENGTH_SHORT).show();

                }
                else if (ski_nickname.length()==0)
                {
                    Toast.makeText(getApplicationContext(),"Please insert your nickname !", Toast.LENGTH_SHORT).show();

                }
                else if (ski_nickname.length()==0 && kom.length()==0)
                {
                    Toast.makeText(getApplicationContext(),"Please insert your nickname and your comment !", Toast.LENGTH_SHORT).show();
                }

                else
                    Comments.add(new Comment(ski_nickname,kom));
                editText1.setText("");
                editText.setText("");
            }
        });
    }
    }
