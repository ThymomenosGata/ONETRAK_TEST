package wordy.com.onetrak_test;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

public class RecycleViewAdapter extends RecyclerView.Adapter<RecycleViewAdapter.ViewHolder> {

    private List<Datas> datas;
    private LayoutInflater inflater;

    public RecycleViewAdapter(Context context, List<Datas> datas) {
        this.datas = datas;
        this.inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = inflater.inflate(R.layout.onetrak_item, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        Datas data = datas.get(i);
        viewHolder.runSteps.setText(data.getRun());
        viewHolder.aerobicSteps.setText(data.getAerobic());
        viewHolder.walkSteps.setText(data.getWalk());
        viewHolder.countSteps.setText(data.getWalk() + data.getAerobic() + data.getRun());
        viewHolder.thisDay.setText(getDate(data.getDate(), "dd.MM.yyyy"));

    }

    @Override
    public int getItemCount() {
        return datas.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        TextView runSteps, walkSteps, aerobicSteps, countSteps, thisDay;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            runSteps = itemView.findViewById(R.id.run);
            walkSteps = itemView.findViewById(R.id.walk);
            aerobicSteps = itemView.findViewById(R.id.aerobic);
            countSteps = itemView.findViewById(R.id.count_steps);
            thisDay = itemView.findViewById(R.id.date);
        }
    }

    private static String getDate(long milliSeconds, String dateFormat) {
        SimpleDateFormat formatter = new SimpleDateFormat(dateFormat);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(milliSeconds);
        return formatter.format(calendar.getTime());
    }

}
