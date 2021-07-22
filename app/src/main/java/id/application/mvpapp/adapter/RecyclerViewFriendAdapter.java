package id.application.mvpapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import id.application.mvpapp.R;
import id.application.mvpapp.model.Friend;

public class RecyclerViewFriendAdapter extends RecyclerView.Adapter<RecyclerViewFriendAdapter.ViewHolder> {

    private Context context;
    private List<Friend> friendList;

    public RecyclerViewFriendAdapter(Context context, List<Friend> friendList) {
        this.context = context;
        this.friendList = friendList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.recycler_view_friend_adapter, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewFriendAdapter.ViewHolder holder, int position) {
        Friend friend = friendList.get(position);
        holder.txtName.setText(friend.getName());
        holder.txtPhone.setText(friend.getPhoneNumber());
    }

    @Override
    public int getItemCount() {
        return friendList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        private TextView txtName, txtPhone;
        public ViewHolder(View itemView) {
            super(itemView);
            txtName = itemView.findViewById(R.id.txtName);
            txtPhone = itemView.findViewById(R.id.txtPhone);
        }
    }
}
