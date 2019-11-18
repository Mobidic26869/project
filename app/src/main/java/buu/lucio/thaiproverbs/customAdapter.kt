package buu.lucio.thaiproverbs

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class customAdapter(var context: Context, var list: ArrayList<List>): BaseAdapter(){

    private class ViewHolder(row: View?) {
        var txtName: TextView
        var txtDetail: TextView


        init {
            this.txtName = row?.findViewById(R.id.name_text) as TextView
            this.txtDetail = row?.findViewById(R.id.detail_text) as TextView

        }
    }
    override fun getView(position: Int, converView: View?, parent: ViewGroup?): View? {
        var view: View?
        var viewHolder: ViewHolder
        if (converView == null){
            var layout = LayoutInflater.from(context)
            view = layout.inflate(R.layout.data_list_form, parent, false)
            viewHolder = ViewHolder(view)
            view.tag = viewHolder
        } else {
            view = converView
            viewHolder = view.tag as ViewHolder
        }

        var list: List = getItem(position) as List
        viewHolder.txtName.text = list.name
        viewHolder.txtDetail.text = list.detail


        return view as View
    }
    override fun getItem(position: Int): Any {
        return list.get(position)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return list.count()
    }

}