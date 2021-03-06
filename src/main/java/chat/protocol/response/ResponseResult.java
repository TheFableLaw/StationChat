package chat.protocol.response;

public enum ResponseResult {
	
	CHATRESULT_SUCCESS,
	CHATRESULT_TIMEOUT,
	CHATRESULT_DUPLICATELOGIN,
	CHATRESULT_SRCAVATARDOESNTEXIST,
	CHATRESULT_DESTAVATARDOESNTEXIST,
	CHATRESULT_ADDRESSDOESNTEXIST,		
	CHATRESULT_ADDRESSNOTROOM,
	CHATRESULT_ADDRESSNOTAID,
	CHATRESULT_FRIENDNOTFOUND,
	CHATRESULT_ROOM_UNKNOWNFAILURE,
	CHATRESULT_ROOM_SRCNOTINROOM,		
	CHATRESULT_ROOM_DESTNOTINROOM,
	CHATRESULT_ROOM_BANNEDAVATAR,
	CHATRESULT_ROOM_PRIVATEROOM,
	CHATRESULT_ROOM_MODERATEDROOM,
	CHATRESULT_ROOM_NOTINROOM,			
	CHATRESULT_ROOM_NOPRIVILEGES,
	CHATRESULT_DATABASE,
	CHATRESULT_CANNOTGETAVATARID,
	CHATRESULT_CANNOTGETNODEID,
	CHATRESULT_CANNOTGETPMSGID,			
	CHATRESULT_PMSGNOTFOUND,
	CHATRESULT_ROOMMAXAVATARSREACHED,
	CHATRESULT_IGNORING,
	CHATRESULT_ROOM_ALREADYEXISTS,
	CHATRESULT_NOTHINGTOCONFIRM,		
	CHATRESULT_DUPLICATEFRIEND,
	CHATRESULT_IGNORENOTFOUND,
	CHATRESULT_DUPLICATEIGNORE,
	CHATRESULT_DBFAIL,
	CHATRESULT_ROOM_DESTAVATARNOTMODERATOR,	
	CHATRESULT_ROOM_DESTAVATARNOTINVITED,
	CHATRESULT_ROOM_DESTAVATARNOTBANNED,
	CHATRESULT_ROOM_DUPLICATEBAN,
	CHATRESULT_ROOM_DUPLICATEMODERATOR,
	CHATRESULT_ROOM_DUPLICATEINVITE,	
	CHATRESULT_ROOM_ALREADYINROOM,
	CHATRESULT_ROOM_PARENTNONPERSISTENT,
	CHATRESULT_ROOM_PARENTBADNODETYPE,
	CHATRESULT_NOFANCLUBHANDLE,
	CHATRESULT_AIDALREADYEXISTS,		
	CHATRESULT_UIDALREADYEXISTS,
	CHATRESULT_WRONGCHATSERVERFORREQUEST,
	CHATRESULT_SUCCESSBADDATA,
	CHATRESULT_NULLNAMELOGIN,
	CHATRESULT_SERVER_IDENTITY_EMPTY,	
	CHATRESULT_SERVER_IDENTITY_TAKEN,
	CHATRESULT_REMOTESERVERDOWN,
	CHATRESULT_NODEIDCONFLICT,
	CHATRESULT_INVALIDNODENAME,
	CHATRESULT_INSUFFICIENTGMPRIVS,		
	CHATRESULT_SNOOPALREADYADDED,
	CHATRESULT_NOTSNOOPING,
	CHATRESULT_ROOM_DESTAVATARNOTTEMPORARYMODERATOR,
	CHATRESULT_ROOM_DESTAVATARNOTVOICE,
	CHATRESULT_ROOM_DUPLICATETEMPORARYMODERATOR, 
	CHATRESULT_ROOM_DUPLICATEVOICE,
	CHATRESULT_AVATARMUSTBELOGGEDOUT,
	CHATRESULT_NOTHINGTODO,
	CHATRESULT_TRANSFERNAMENULL,
	CHATRESULT_TRANSFERUSERIDZERO,				
	CHATRESULT_TRANSFERADDRESSNULL,
	CHATRESULT_OUTOFIDS,
	CHATRESULT_ROOM_LOCALROOM,
	CHATRESULT_ROOM_GAMEROOM,
	CHATRESULT_ROOM_DESTAVATARNOTENTERING,		
	CHATRESULT_INSUFFICIENTPRIORITY,
	CHATRESULT_ROOM_WAITINGFORENTRY,
	CHATRESULT_INBOXLIMITEXCEEDED,
	CHATRESULT_DUPLICATEDESTINATION,
	CHATRESULT_CATEGORYLIMITEXCEEDED,			
	CHATRESULT_MESSAGE_FILTER_FAILURE,
	CHATRESULT_INVALID_INPUT,

}
