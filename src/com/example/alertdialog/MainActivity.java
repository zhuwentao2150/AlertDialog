package com.example.alertdialog;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends Activity {
	private TextView text_01;
	private Button but_01;
	private Button but_02;
	private Button but_03;
	private Button but_04;
	private Button but_05;
	private Button but_06;
	private Button but_07;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		text_01 = (TextView) findViewById(R.id.text_01);
		but_01 = (Button) findViewById(R.id.but_01);
		but_02 = (Button) findViewById(R.id.but_02);
		but_03 = (Button) findViewById(R.id.but_03);
		but_04 = (Button) findViewById(R.id.but_04);
		but_05 = (Button) findViewById(R.id.but_05);
		but_06 = (Button) findViewById(R.id.but_06);
		but_07 = (Button) findViewById(R.id.but_07);
		
		but_01.setOnClickListener(ock);
		but_02.setOnClickListener(ock);
		but_03.setOnClickListener(ock);
		but_04.setOnClickListener(ock);
		but_05.setOnClickListener(ock);
		but_06.setOnClickListener(ock);
		but_07.setOnClickListener(ock);
		
	}
	// 监听
	private OnClickListener ock = new OnClickListener() {
		public void onClick(View v) {
			switch (v.getId()) {
			case R.id.but_01:
				showExitDialog01();
				break;
			case R.id.but_02:
				showExitDialog02();
				break;
			case R.id.but_03:
				showExitDialog03();
				break;
			case R.id.but_04:
				showExitDialog04();
				break;
			case R.id.but_05:
				showExitDialog05();
				break;
			case R.id.but_06:
				showExitDialog06();
				break;
			case R.id.but_07:
				showExitDialog07();
				break;
			default:
				break;
			}
			
		}
	};
	// 简单消息提示框
	private void showExitDialog01(){
		// Builder中的"this"代表他的引用在Create中
		new AlertDialog.Builder(this)
			.setTitle("标题")
			.setMessage("简单的消息提示框")
			.setPositiveButton("确定", null)
			.show();
	}
	// 带“是”和“否”的提示框
	private void showExitDialog02(){
		new AlertDialog.Builder(this)
			.setTitle("带确定键的提示框")
			.setMessage("确定吗")
			.setPositiveButton("是", null)
			.setNegativeButton("否", null)
			.show();
	}
	// 可输入文本的提示框
	private void showExitDialog03(){
		final EditText edt = new EditText(this);
		// 设置输入框的大小
		edt.setMinLines(3);
		new AlertDialog.Builder(this)
			.setTitle("请输入")
			.setIcon(android.R.drawable.ic_dialog_info)
			.setView(edt)
			.setPositiveButton("确定", new DialogInterface.OnClickListener() {
				// 把输入的文字传递给text
				public void onClick(DialogInterface arg0, int arg1) {
					text_01.setText(edt.getText().toString());
				}
			})
			.setNegativeButton("取消", null)
			.show();
		
	}
	// 单选提示框
	private void showExitDialog04(){
		new AlertDialog.Builder(this)
			.setTitle("请选择")
			.setIcon(android.R.drawable.ic_dialog_info)
			.setSingleChoiceItems(new String[]{"选项1","选项2","选项3","选项4","选项5","选项6"}, -1, new DialogInterface.OnClickListener(){
				public void onClick(DialogInterface arg0, int arg1) {
					switch (arg1) {
					case 0:text_01.setText("选择了一");break;
					case 1:text_01.setText("选择了二");break;
					case 2:text_01.setText("选择了三");break;
					default:
						break;
					}
					arg0.dismiss();
				}
			})
			.setNegativeButton("取消", null)
			.show();
	}
	// 多选提示框
	private void showExitDialog05(){
		new AlertDialog.Builder(this)
			.setTitle("多选框")
			.setMultiChoiceItems(new String[]{"选项1","选项2","选项3","选项4","选项5","选项6"}, null, null)
			.setPositiveButton("确定",null)
			.setNegativeButton("取消",null)
			.show();
	}
	// 列表对话框
	private void showExitDialog06(){
		
		new AlertDialog.Builder(this)
			.setTitle("列表框")
			.setItems(new String[]{"列表1","列表2","列表3","列表4","列表5"}, null)
			.setNegativeButton("确定", null)
			.show();
	}
	// 显示图片的对话框
	private void showExitDialog07(){
		ImageView img = new ImageView(this);
		img.setImageResource(R.drawable.hua);
		new AlertDialog.Builder(this)
			.setTitle("图片框")
			.setView(img)
			.setPositiveButton("确定", null)
			.show();
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
