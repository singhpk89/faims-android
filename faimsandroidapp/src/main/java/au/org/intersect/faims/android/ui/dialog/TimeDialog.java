package au.org.intersect.faims.android.ui.dialog;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import au.org.intersect.faims.android.R;
import au.org.intersect.faims.android.ui.view.CustomTimePicker;

public class TimeDialog extends AlertDialog {
	
	private CustomTimePicker input;
	
	public TimeDialog(Context context, String title, String message, 
			OnClickListener okListener, OnClickListener cancelListener) {
		super(context);
		setTitle(title);
		setMessage(message);
		input = new CustomTimePicker(this.getContext());
		setView(input);
		setOkListener(okListener);
		setCancelListener(cancelListener);
	}
	
	public void setOkListener(OnClickListener okListener) {
		setButton(DialogInterface.BUTTON_POSITIVE,
				this.getContext().getResources().getString(R.string.confirm_dialog_button), okListener);
	}
	
	public void setCancelListener(OnClickListener cancelListener) {
		setButton(DialogInterface.BUTTON_NEGATIVE,
				this.getContext().getResources().getString(R.string.cancel_dialog_button), cancelListener);
	}
	
	public String getTimeText() {
		return input.getValue();
	}
}
