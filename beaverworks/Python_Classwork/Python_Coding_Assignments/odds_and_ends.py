import numpy as np
import matplotlib as mpl
import matplotlib.pyplot as plt

data = np.load('/Users/jake/Documents/Coding-Stuff/beaverworks/Python_Classwork/Python_Coding_Assignments/mystery-img.npy')
plt.imshow(data, cmap='gray')
plt.show()
