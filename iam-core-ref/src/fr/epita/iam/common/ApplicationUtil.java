package fr.epita.iam.common;

import fr.epita.iam.datamodel.Identity;

public class ApplicationUtil {
public static int getCriteriaCount(Identity identity) {
	int count =0;
	if(identity.getDisplayName()!=null && identity.getDisplayName().equals(""))
		count++;
	if(identity.getDob()!=null)
		count++;
	if(identity.getEmail()!=null && identity.getEmail().equals(""))
		count++;
	if(identity.getUid()!=null && identity.getUid().equals(""))
		count++;
	return count;
}
}
