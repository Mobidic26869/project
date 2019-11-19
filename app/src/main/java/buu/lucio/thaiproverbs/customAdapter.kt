package buu.lucio.thaiproverbs

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class customAdapter(var context: Context, var listType: ArrayList<ListData>): BaseAdapter() {
    private class ViewHolder(row: View?){
        var txtName: TextView

        init {
            this.txtName = row?.findViewById(R.id.name_text) as TextView

        }
    }
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var view: View?
        var viewHolder: ViewHolder
        if(convertView == null){
            var layout = LayoutInflater.from(context)
            view = layout.inflate(R.layout.list_item,parent,false)
            viewHolder = ViewHolder(view)
            view.tag = viewHolder
        } else {
            view = convertView
            viewHolder = view.tag as ViewHolder
        }
        var listc:ListData = getItem(position) as ListData
        viewHolder.txtName.text = listc.name
        return view as View

    }

    override fun getItem(position: Int): Any {
        return listType.get(position)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return listType.count();
    }
    }
